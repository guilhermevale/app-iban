package app;

import java.util.List;
import java.util.regex.Matcher;

import org.dom4j.rule.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.Transaction;
import app.TransactionRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/users/1") 
public class TransactionController {
	@Autowired 
	
	private TransactionRepository transactionRepository;
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewTransaction (@RequestParam String transactionDate, @RequestParam Integer amount) {
		
		Transaction n = new Transaction();
		n.setUserId("1");
		n.setTransactionDate(transactionDate);
		n.setAmount(amount);
		transactionRepository.save(n);
		return "Saved";
	}
	
	/*
	@PostMapping("/transactions")
	Transaction newTransaction(@RequestBody Transaction newTransaction) {
		return transactionRepository.save(newTransaction);
	}*/
	
	
	@GetMapping("/transactions")
	public @ResponseBody Iterable<Transaction> search() { //@RequestParam(value = "search") String search
		//TransactionSpecificationsBuilder builder = new TransactionSpecificationsBuilder();
        //Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
        //Matcher matcher = pattern.matches(search + ",");
        //while (matcher.find()) {
            //builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        //} 
        //Specification<Transaction> spec = builder.build();
		//return transactionRepository.findAll(spec)
        return transactionRepository.findAll();
	}
	
	
	@GetMapping("/transactions/lastday")
	public @ResponseBody String lastDay(@RequestParam(required = false, value = "sortby") String sortBy) {
		return "last day";
	}
	@GetMapping("/transactions/lastthreedays")
	public @ResponseBody String lastThreeDays(@RequestParam(required = false, value = "sortby") String sortBy) {
		return "last three days";
	}
	
	@GetMapping("/transactions/lastweek")
	public @ResponseBody String lastWeek(@RequestParam(required = false, value = "sortby") String sortBy) {
		return "last week";
	}
	
	//@PathVariable long userid
	//transactions?sortby=date,amount 

	
}
