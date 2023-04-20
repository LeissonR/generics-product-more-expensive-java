package model.services;

import java.util.Collections;
import java.util.List;

public class CalculationService {

	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		return Collections.max(list);
	}
}
