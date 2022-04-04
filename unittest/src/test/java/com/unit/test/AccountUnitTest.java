package com.unit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;

public class AccountUnitTest {

	AccountDetails accd;

	@BeforeAll
	public static void initAll() {
		System.out.println("@BeforeAll sabse phle m hi aaya");
		System.out.println("Initialize kro");
	}

	@BeforeEach
	public void init() {
		accd = new AccountDetails("Anant", 112344d, 123344, 12d, "Savings");
		System.out.println("Before each is executed");
		System.out.println("Account balance" + " " + accd.getBalance());
	}

	@Test
	public void depositTest() {

		accd.deposit(10d);

		System.out.println("first test block is excecuted");

	}

	@Test
	public void withdrawalTest() {

		accd.withdraw(30d);

		System.out.println("Second test block is being executed");
	}

	@AfterEach
	public void balance() {
		System.out.println("Executing after each");
		System.out.println("getting account balance" + " " + accd.getBalance());

	}

	@AfterAll
	public static void teardownAll() {
		System.gc();
		System.out.println("Start clean up....");
	}
}
