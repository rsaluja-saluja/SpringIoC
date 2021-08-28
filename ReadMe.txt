Dependency Injection: - Design pattern
	If Object depends on other objects then client can focus on functionality of objects rather than building it.
	Dependencies can be supplied in form of beans.
	The construction and injection of dependencies is managed by SPring IoC container.
Bean -
	java class that encapsulates one or more objects.
	re-usable components
	is Serializable
	have 0-arg ctor
	getters/setters
	managed by IoC container
IoC - Inversion of Control
	Design Principle where control of objects carried out by framework/container
	The flow of conyrol is inverted to tradional programming.
	DI is one way to implement IoC
	Other methods:
		Factory method
		Service locator
	Belefits:
		Running Task is independent from its implementations.
		Modularity makes it easier to test
		Implementatio can be changed easily
		Provides much of plumbing work required by applications.
		
Bean Configuraion:
	in XML File
	Java based configuraion(Using annotaions and confuguraion class)

IoC container Types:
		BeanFactory
			Beans are initialized lazily(when getBean is called)
			XML as Bean configuration
			lightweight beans suited for mobile application
		ApplicationContext - 
			extension of BeanFactory
			Bean configuration in XML File
			Beans are created proactively - when applicationContext is loaded
			allows to use annotaions based DI
				Way1:
					@Component - with bean class
					@Configuration, @ComponentScan - Java configuration file
				Way2:
					no need to @Component and @companntScan
					@Configuration - Java configuration file
					@Bean - with method returning object 
			supports publishing of application events
		Spring recommend ApplicationContext
			
Bean Life Cycle
	init and destroy methods
	Can be defined on applicationContext.xml file or Java configuration file
	init method is called after ctor call
	destroy method would be called when context is closed
	
	javax.annotation-api dependency required to defie annotaion for init and destroy method
	@PostConstruct - init method
	@PreDestroy - destroy method
	Also need to add <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/> bean class in application-context.xml file
	
Bean data population
	Can be done in XML file or Java configuration file
	in Java conf file Can be done using setter methods
	in XML file
		using property tags that would call setter methods
		that would call parameteized ctor
		
Referencing Beans:
	Car refers Engine
	Can be defined in applicationContextAuto.xml file as
		CarBean <property ref="engine bean name">
		<construtor-arg ref="EngineBeanName">
		or defining engine bean itself inside Car bean

Autowiring Bean:
	USe autowire attribute in bean definition in XML file
		No need to specify engine as property in CarBean
		use autowire="byName" in CarBean - engine bean name should be same as property name
		use autowire="byType" otherwise
		use autowire="constructor" is car bean has constructor args instead of property tags
			engine bean name shoudl be same as defined in car constructor
	Use Autowired annotation with engine property in Car.java. It will call default ctor and doesn't call setter method setEngine()
	USe @Autowired with setter method, it will cal default ctor and also call setter method
	USe @Autowired with parametrized ctor, carbean should be defined with ctor arg instead of property tags