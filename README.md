# Springboot application 


Make any class as a bean in springboot use @Component, it goes in IOC making it a derivable bean

Example :

@Component
public class Laptop


1. ### Using **applicationContext** to derive objects

Example ----->

ApplicationContext app = SpringbootApplication.run(MainClass.class, args);
      
Laptop l = app.getBean(Laptop.class);



2. ### Using @**Autowired** (field injection) to derive objects

Example -----> 

@Autowired
public Laptop laptop;



3. ### Contructor injection


Example ------>

private Laptop laptop;

public Dev(Laptop l) {
this. laptop = l;
}

4. 

