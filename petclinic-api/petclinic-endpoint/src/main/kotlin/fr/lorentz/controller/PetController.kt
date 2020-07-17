package fr.lorentz.controller

import fr.lorentz.petclinic.pet.entity.PetEntity
import fr.lorentz.petclinic.pet.entity.toEntity
import fr.lorentz.petclinic.pet.request.PetUseCaseRequest
import fr.lorentz.petclinic.pet.usecase.CreatePetUseCase
import fr.lorentz.petclinic.pet.usecase.ListPetsUseCase
import fr.lorentz.resources.PetResource
import fr.lorentz.resources.toResource
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pets")
class PetController(val listPetUseCase: ListPetsUseCase,
                    val createPetUseCase: CreatePetUseCase) {

    @GetMapping
    fun getPets(): List<PetResource> {
        return listPetUseCase.listPets().map { it.toResource() }
    }

    @PostMapping
    fun addPet(@RequestBody petRequestBody: PetRequestBody): PetResource {
        return createPetUseCase.create(petRequestBody.toUseCase()).toResource()
    }
}

data class PetRequestBody(val name: String, val species: String, val birthYear: Int)

fun PetRequestBody.toUseCase(): PetUseCaseRequest {
    return PetUseCaseRequest(
            name = this.name,
            species = this.species,
            birthYear = this.birthYear
    )
}