package com.mukesh.github.cicd.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdPipelineApplication {

	@GetMapping("/welcome")
	public String greetings() {
		return "Welcome to Jenkins Github Cicd Pipeline Application Demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdPipelineApplication.class, args);

		/*
		Create a new public repository by logging into your github account.
		new repository name: devops-jenkins-github-docker-demo

		// commands to create a new repository using powershell/cmd/git-bash/terminal(In IntelliJ)
		cd E:\spring-boot-projects\github-cicd-pipeline
		git init
		git status
		git add src
		git add pom.xml
		git commit -m "first commit"
		git branch -M master
		git remote add origin https://github.com/MukeshKYadav/devops-jenkins-github-docker-demo.git
		git push -u origin master

		// Not Required, can be added from Remote server as well.
		echo "# devops-jenkins-github-docker-demo" >> README.md

		// to get the docker image to your local,use below command
		docker pull mukeshyadav2023/springboot-github-actions-demo:latest
		// To run this docker image, can be run directly from docker desktop, by clicking on Run, Else
		docker run -p 8080:8080 mukeshyadav2023/springboot-github-actions-demo
		*/
	}
}
