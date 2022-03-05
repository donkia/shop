package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
/** JPA의 Auditing 기능을 활성화
 * */
@EnableJpaAuditing
public class AuditConfig {

    /** 등록자와 수정자를 처리해주는 AuditorAware을 빈으로 등록
     * LocalDateTime은 스프링 JPA에서 알아서 해주지만, String 타입은 빈으로 등록하는 과정이 필요
     * 출처 : https://goodgid.github.io/Spring-Data-JPA-Auditing/
     * */
    @Bean
    public AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl();
    }
}
