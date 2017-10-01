package com.pickdata.beta;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ScoreTest {
	
	@Inject
	Double offset;
	@Inject
	int pod = 20;
	@Inject
	double score;
	@Inject
	final double log2 = 0.30102999566;
	@Inject
	Double beta;
	@Inject
	Double minBeta;

	@Test
	public void test() {
		Beta betaClass = new Beta();

		Map<String, Double> mapt13 = betaClass.mapc11();
		minBeta = betaClass.minBeta(mapt13);

		Set<String> keySet = mapt13.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			beta = mapt13.get(key);
			offset = (beta) - (minBeta);
			System.out.println(beta + " - " + minBeta + " = " + offset);
		}

	}

}
