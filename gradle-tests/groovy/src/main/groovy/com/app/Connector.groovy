package com.app

import org.apache.commons.lang3.StringUtils

class Connector {

    Disconnect dis = new Disconnect()
	def capture(args) {
		def rev = StringUtils.swapCase(args.flatten().toString())
		println rev
		dis.release(rev)
	}

}