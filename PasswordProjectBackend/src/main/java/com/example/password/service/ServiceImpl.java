package com.example.password.service;

import java.util.ArrayList;
import java.util.List;

import com.example.password.model.Model;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Override
	public String getPass(Model pass) {

		int size = pass.getDigit() + pass.getLowerCase() + pass.getSpecialChar() + pass.getUpperCase();

		List<Integer> list = new ArrayList<>();

		list.add(pass.getSpecialChar());
		list.add(pass.getDigit());
		list.add(pass.getUpperCase());
		list.add(pass.getLowerCase());

		StringBuilder sb = new StringBuilder();
		int spcl = 0;

		while (sb.length() != size) {

			int a = (int) ((Math.random() * (4 - 0)) + 0);

			if (a == 0) {
				if (list.get(a) != 0) {

					spcl = (int) ((Math.random() * (4 - 0)) + 0);

					if (spcl == 0)
						sb.append((char) (int) ((Math.random() * (48 - 32)) + 32));
					else if (spcl == 1)
						sb.append((char) (int) ((Math.random() * (65 - 58)) + 58));
					else if (spcl == 2)
						sb.append((char) (int) ((Math.random() * (97 - 91)) + 91));
					else
						sb.append((char) (int) ((Math.random() * (127 - 123)) + 123));

					list.set(a, list.get(a) - 1);
				}

			} else if (a == 1) {
				if (list.get(a) != 0) {
					sb.append((char) (int) ((Math.random() * (58 - 48)) + 48));
					list.set(a, list.get(a) - 1);
				}

			} else if (a == 2) {

				if (list.get(a) != 0) {
					sb.append((char) (int) ((Math.random() * (91 - 65)) + 65));
					list.set(a, list.get(a) - 1);
				}

			} else {

				if (list.get(a) != 0) {
					sb.append((char) (int) ((Math.random() * (123 - 97)) + 97));
					list.set(a, list.get(a) - 1);
				}
			}
		}

		return sb.toString();
	}

}
