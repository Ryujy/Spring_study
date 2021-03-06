package hello.hellospring;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Public MemberService memberService() {
        return new MemberService();
    }

    @Bean
    Public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
