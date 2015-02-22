package cr.rgarcia.jba.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cr.rgarcia.jba.entity.Blog;
import cr.rgarcia.jba.entity.Item;
import cr.rgarcia.jba.entity.Role;
import cr.rgarcia.jba.entity.User;
import cr.rgarcia.jba.repository.BlogRepository;
import cr.rgarcia.jba.repository.ItemRepository;
import cr.rgarcia.jba.repository.RoleRepository;
import cr.rgarcia.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init(){
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_USER");
		roleRepository.save(roleAdmin);		
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userAdmin.setEmail("admin@webwave.com");
		userRepository.save(userAdmin);

		User user1 = new User();
		user1.setName("Rubén");
		List<Role> roles1 = new ArrayList<Role>();
		roles1.add(roleUser);
		user1.setRoles(roles1);
		user1.setEmail("rgarcia@webwave.com");
		userRepository.save(user1);		
		
		User user2 = new User();
		user2.setName("Kimberly");
		List<Role> roles2 = new ArrayList<Role>();
		roles2.add(roleUser);
		user2.setRoles(roles2);
		user2.setEmail("kgodinez@webwave.com");
		userRepository.save(user2);			
		
		
		Blog blog = new Blog();
		blog.setName("Java BLogs");
		blog.setUrl("sdfdsf");
		blog.setUser(user2);
		blogRepository.save(blog);
		
		Item item1 = new Item();
		item1.setBlog(blog);
		item1.setTitle("first");
		item1.setLink("sdfsdfsdf");
		item1.setPublishedDate( new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(blog);
		item2.setTitle("first");
		item2.setLink("sdfsdfsdf");
		item2.setPublishedDate( new Date());
		itemRepository.save(item2);
		
		
	}
	
	

}
