package test;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Hesapmakinesitest {
	
	 @Test
	 public void testTopla() {
		Hesapmakinesi hesapMakinesi = new Hesapmakinesi();
		int sayi1 = 5;
		int sayi2 = 19;
		int toplam = hesapMakinesi.topla(sayi1, sayi2);
			
		Assert.assertEquals(24, toplam);
	}

}
