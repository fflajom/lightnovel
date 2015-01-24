package com.lightnovel.lightnovel.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class DozerHelper extends DozerBeanMapper{


	public <T, U> List<U> map(final List<T> source, final Class<U> destType) {

		final List<U> dest = new ArrayList<U>();

		for (T element : source) {
			if (element == null) {
				continue;
			}
			dest.add(this.map(element, destType));
		}

		List<U> s1 = new ArrayList<U>();
		s1.add(null);
		dest.removeAll(s1);

		return dest;
	}
}

