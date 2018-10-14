package app;

import org.springframework.data.repository.CrudRepository;

import app.Transaction;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}
