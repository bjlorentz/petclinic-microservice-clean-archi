package fr.lorentz.config

import fr.lorentz.petclinic.annotation.UseCase
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType

@Configuration
@ComponentScan(
        basePackages = ["fr.lorentz.petclinic"],
        includeFilters = [ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value= [UseCase::class])])
class UseCaseConfiguration