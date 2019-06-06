package org.springframework.fu.kofu.samples

import org.springframework.boot.WebApplicationType
import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.webflux.security
import org.springframework.fu.kofu.webflux.webFlux

fun securityDsl() {
	application(WebApplicationType.REACTIVE) {
		security()
		webFlux {
			security()
		}
	}
}
