/*
 * package com.healtfreedom.loginauth;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.healthfreedom.model.MParticipant; import
 * com.healthfreedom.repository.MParticipantRepository;
 * 
 * import java.util.Optional;
 * 
 * @Service public class MyUserDetailsService implements UserDetailsService {
 * 
 * 
 * @Autowired UserRepository userRepository;
 * 
 * 
 * @Autowired MParticipantRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String userName) throws
 * UsernameNotFoundException { System.out.println("Username : " + userName);
 * Optional<MParticipant> user =
 * Optional.of(userRepository.findByUsername(userName));
 * 
 * user.orElseThrow(() -> new UsernameNotFoundException("Not found: " +
 * userName));
 * 
 * return user.map(MyUserDetails::new).get(); } }
 */