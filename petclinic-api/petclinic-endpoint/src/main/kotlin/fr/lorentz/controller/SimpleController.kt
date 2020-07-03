package fr.lorentz.controller

import fr.lorentz.petclinic.usecase.SimpleUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class SimpleController (val simpleUseCase: SimpleUseCase) {

    @GetMapping("/simple")
    fun getSimple() : String {
        return simpleUseCase.getState()
    }
}