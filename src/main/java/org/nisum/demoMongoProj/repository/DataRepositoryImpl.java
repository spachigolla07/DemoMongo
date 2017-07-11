package org.nisum.demoMongoProj.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.nisum.demoMongoProj.model.Employee;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class DataRepositoryImpl implements DataRepository {

	@Override
	public void insert(Employee employee) {
		MongoClient mongoClient = new MongoClient("localhost");
		MongoDatabase mongoDatabase = mongoClient.getDatabase("employeeDatabase");
		MongoCollection employeeInformation = mongoDatabase.getCollection("employeeInformation");
		Document employeeDoc = new Document("_id", employee.get_id()).append("empName", employee.get_empName())
				.append("empDesignation", employee.get_empDesignation()).append("empSalary", employee.get_empSalary());
		employeeInformation.insertOne(employeeDoc);
		mongoClient.close();
	}

	@Override
	public List<Employee> getEmployees() {
		MongoClient mongoClient = new MongoClient("localhost");
		MongoDatabase mongoDatabase = mongoClient.getDatabase("employeeDatabase");
		MongoCollection employeeInformation = mongoDatabase.getCollection("employeeInformation");
		List<Document> documents = (List<Document>) employeeInformation.find().into(new ArrayList<Document>());
		List<Employee> employees = new ArrayList<Employee>();
		for (Document employee : documents) {
			employees.add(new Employee(employee.getInteger("_id"), employee.getString("empName"),
					employee.getString("empDesignation"), employee.getDouble("empSalary")));
		}
		return employees;
	}
}
