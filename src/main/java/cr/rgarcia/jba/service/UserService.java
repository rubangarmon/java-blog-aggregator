package cr.rgarcia.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.rgarcia.jba.repository.UserRepository;
import cr.rgarcia.jba.entity.User;


@Service
public class UserService {

	@Autowired UserRepository userRepository;
	
	public List<User> findAll(){
		
		return userRepository.findAll();
		
	}
	
}
