package pl.nauka.jenkexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkexampleApplication.class, args);
	}

	public int substract(int a,int b){
		return a-b;
	}



	public int added(int a,int b){
		return a+b;
	}
}
