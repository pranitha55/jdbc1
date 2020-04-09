package com.capgemini.librarymanagementsystemjdbc.factory;

import com.capgemini.librarymanagementsystemjdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystemjdbc.dao.UserDAOImple;
import com.capgemini.librarymanagementsystemjdbc.service.UsersService;
import com.capgemini.librarymanagementsystemjdbc.service.UsersServiceImple;

public class LibraryFactory {

	
	public static UserDAO getUserDAO() {
		return new UserDAOImple();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImple();
	}
	
}
