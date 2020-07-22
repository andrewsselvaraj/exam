package com.paypal.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		String s = "https://attacomsian.com/blog/spring-data-jpa-many-to-many-mapping#:~:text=A%20many%2Dto%2Dmany%20relationship%20between%20two%20entities%20is%20defined,that%20owns%20the%20bidirectional%20relationship.";
		s = s + "\n https://github.com/attacomsian/code-examples/tree/master/spring-data-jpa/jpa-mappings/src/main/java/com/attacomsian/jpa/many2many/domains";
		System.out.println(s);
	}
	
	/*
	@Bean
    public CommandLineRunner mappingDemo(StudentRepository studentRepository,
                                         CourseRepository courseRepository) {
        return args -> {

            // create a student
            Student student = new Student("John Doe", 15, "8th");

            // save the student
            studentRepository.save(student);

            // create three courses
            Course course1 = new Course("Machine Learning", "ML", 12, 1500);
            Course course2 = new Course("Database Systems", "DS", 8, 800);
            Course course3 = new Course("Web Basics", "WB", 10, 0);

            // save courses
            courseRepository.saveAll(Arrays.asList(course1, course2, course3));

            // add courses to the student
            student.getCourses().addAll(Arrays.asList(course1, course2, course3));

            // update the student
            studentRepository.save(student);
        };
    }
*/
}
