package fr.lorentz.petclinic.pet.usecase

import fr.lorentz.petclinic.pet.request.PetUseCaseRequest
import fr.lorentz.petclinic.pet.response.PetResponse

interface CreatePetUseCase {
    fun create(petRequest : PetUseCaseRequest) : PetResponse
}