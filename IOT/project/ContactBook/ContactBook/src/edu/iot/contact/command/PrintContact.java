package edu.iot.contact.command;

import edu.iot.contact.service.ContactBook;

public class PrintContact implements Command {

	@Override
	public void execute(ContactBook cb) {
		// TODO Auto-generated method stub
		cb.printContact();
	}

}
