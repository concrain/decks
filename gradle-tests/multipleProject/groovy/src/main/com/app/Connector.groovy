package com.app

import org.apache.commons.lang3.StringUtils

class Connector {

	def capture(args) {
		println(StringUtils.swapCase(args.flatten().toString()))
	}
}