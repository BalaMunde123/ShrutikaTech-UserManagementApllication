package com.BikkadIt.UserManagementApp.sevice;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.UserManagementApp.Repository.CityRepository;
import com.BikkadIt.UserManagementApp.Repository.CountryRepository;
import com.BikkadIt.UserManagementApp.Repository.StateRepository;
import com.BikkadIt.UserManagementApp.Repository.UserRepository;
import com.BikkadIt.UserManagementApp.entities.City;
import com.BikkadIt.UserManagementApp.entities.Country;
import com.BikkadIt.UserManagementApp.entities.State;
import com.BikkadIt.UserManagementApp.entities.UserAccountEntity;
import com.BikkadIt.UserManagementApp.payload.Login;
import com.BikkadIt.UserManagementApp.payload.UnlockAccount;
import com.BikkadIt.UserManagementApp.payload.UserDto;

@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Country> getAllCountry() {
		List<Country> findAll = countryRepository.findAll();
		return findAll;
	}

	@Override
	public List<State> getAllStates(int countryId) {
		List<State> list = this.stateRepository.findByCountryId(countryId);
		return list;

	}

	@Override
	public List<City> getAllCitis(int stateId) {
		List<City> list = this.cityRepository.findByStateId(stateId);

		return list;
	}

//save
	@Override
	public boolean saveUser(UserDto user) {
		user.setAccStatus("LOCKED");
		user.setPassword(generateRandomPassword());
		UserAccountEntity userAccountEntity = new UserAccountEntity();
		BeanUtils.copyProperties(user, userAccountEntity);
		UserAccountEntity save = this.userRepository.save(userAccountEntity);
		if (save != null) {
			return true;
		} else {
			return false;
		}

	}

	public String generateRandomPassword() {
		return null;

	}

//logincheck

	@Override
	public String loginCheck(Login login) {
		String email = login.getEmail();
		String password = login.getPassword();

		UserAccountEntity userAccountEntity = this.userRepository.findByEmailAndPassword(email, password);

		if (userAccountEntity != null) {

			if (userAccountEntity.getAccStatus().equals("LOCKED")) {

				return "Your Account is Locked";
			} else {

				return "Login Success";
			}

		} else {
			return "invalid Creadential";
		}

	}

	//unlock logic
	@Override
	public boolean unlockAccount(UnlockAccount unlockAccount) {
		
		String email = unlockAccount.getEmail();
		String tempPwd = unlockAccount.getTempPwd();
		
		UserAccountEntity user = this.userRepository.findByEmailAndPassword(email, tempPwd);
		
		if(user!=null) {
			user.setAccStatus("UNLOCKED");
			user.setPassword(unlockAccount.getNewPassword());
			this.userRepository.save(user);
			return true;
		}else {
			return false;
		}
		
		
	}
}
