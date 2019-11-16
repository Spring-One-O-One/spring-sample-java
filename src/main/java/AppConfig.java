//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//import com.pluralsight.repository.CustomerRepository;
//import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
//import com.pluralsight.service.CustomerService;
//import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

    // For accessing app.properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    // With setter injection
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		service.setCustomerRepository(getCustomerRepository());
//
//		return service;
//	}

    // with constructor injection
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//
//		return service;
//	}

    // With Autowired injection
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//
//		return service;
//	}

//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
