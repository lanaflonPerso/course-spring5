package course.spring.webservice.dao;

import course.spring.webservice.wsdl.Country;
import course.spring.webservice.wsdl.Currency;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CountryRepository {
    private static Map<String, Country> countries = new ConcurrentHashMap<>();

    @PostConstruct
    public void initData(){
        Country bulgaria = new Country();
        bulgaria.setName("Bulgaria");
        bulgaria.setCapital("Sofia");
        bulgaria.setCurrency(Currency.BGN);
        bulgaria.setPopulation(46704314);

        countries.put(bulgaria.getName(), bulgaria);

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);
    }

    public  Country findCountry(String name) {
        return countries.get(name);
    }

}
