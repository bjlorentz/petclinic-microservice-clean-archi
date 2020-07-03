package fr.lorentz.app

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["fr.lorentz"])
@EnableAutoConfiguration
class PetclinicEndpointApplication

fun main(args: Array<String>) {
	runApplication<PetclinicEndpointApplication>(*args)
}
