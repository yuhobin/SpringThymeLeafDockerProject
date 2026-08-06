package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 *  git init ==> 연결하는 폴더 생성
 *  git remote add origin 깃주소 => git 연결
 *  git add . => 보낼 데이터 모으기
 *  git commit -m "메세지"
 *  git push -u origin master --force => 강제 전송
 *  
 *  -------------------------------------------
 *  수정
 *  git add .
 *  git commit -m "메세지"
 *  git push -u origin master
 */
@SpringBootApplication
public class SpringThymeLeafDockerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeLeafDockerProjectApplication.class, args);
	}

}
