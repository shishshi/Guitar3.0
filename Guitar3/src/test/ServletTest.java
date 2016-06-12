package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.IGuitar;
import dao.dataAccess;
import dao.dataAccess1;
import model.Guitar;


public class ServletTest {

	@Test
	public void test() {
		IGuitar i = dataAccess1.createGuitarDao();
		List<Guitar> list = i.getAllGuitars();
		assertEquals(list.size(),81);
	}

}
