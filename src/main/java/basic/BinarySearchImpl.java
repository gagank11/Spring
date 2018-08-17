package basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	@Qualifier("bubble")
	private SortAlgorithm sortalgorithm; 


	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
		int[] sortedNumbers= sortalgorithm.sort(numbers);
		 System.out.println(sortalgorithm);
	
		
		return 3; 
	}

	@PostConstruct
	public void postConstruct() {
		
		LOGGER.info("POST CONSTRUCT");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		 
		LOGGER.info("PRE DESTRUCT");
		
	}
	
	
	
}
