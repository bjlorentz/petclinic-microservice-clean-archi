package fr.lorentz.controller

import fr.lorentz.petclinic.pet.usecase.ListPetsUseCase
import fr.lorentz.resources.PetResource
import fr.lorentz.resources.toResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/pets")
class PetController(val listPetUseCase : ListPetsUseCase) {

    @GetMapping
    fun getPets() : List<PetResource> {
        return listPetUseCase.listPets().map { it.toResource() }
    }
}