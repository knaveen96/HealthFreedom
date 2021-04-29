package com.healthfreedom.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.healthfreedom.model.MParticipant;
import com.healthfreedom.repository.MParticipantRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private MParticipantRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MParticipant user = userRepository.findByUsername(username);
        
        if(user ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        System.out.println("User Details :: "+user.getUsername()+" "+user.getPassword());
        return new CustomUserDetails(user);
    }
}
