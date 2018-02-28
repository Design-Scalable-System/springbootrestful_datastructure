/**
 * 
 */
package com.dss.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dss.constants.Constant;
import com.dss.pojo.ArrayObject;
import com.dss.service.ArrayService;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
@Controller
@RequestMapping(path = Constant.ROOT_PATH)
public class ArrayController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ArrayController.class);

	@Autowired
	private ArrayService arrayService;

	@PostMapping(path = Constant.ARRAY_ROTATION_PATH)
	public ResponseEntity<ArrayObject> arrayRotation(@RequestBody ArrayObject arrayObject) {

		LOGGER.info("Array object : {}", arrayObject);

		ArrayObject rotatedArray = arrayService.rotateArray(arrayObject);

		LOGGER.info("Array object : {}", arrayObject);

		if (rotatedArray == null) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok(rotatedArray);
	}

}
