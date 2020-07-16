package fr.lorentz.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication(scanBasePackages = ["fr.lorentz", "fr.lorentz.petclinic"])
@EntityScan(basePackages = ["fr.lorentz"])
@EnableJpaRepositories(basePackages = ["fr.lorentz"])
class PetclinicEndpointApplication

fun main(args: Array<String>) {
	SpringApplication.run(PetclinicEndpointApplication::class.java, *args)
}
