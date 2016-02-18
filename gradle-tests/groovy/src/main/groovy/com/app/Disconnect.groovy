package com.app

import org.apache.commons.lang3.StringUtils

class Disconnect {

	def release(args) {
		println(StringUtils.swapCase(args))
	}
}