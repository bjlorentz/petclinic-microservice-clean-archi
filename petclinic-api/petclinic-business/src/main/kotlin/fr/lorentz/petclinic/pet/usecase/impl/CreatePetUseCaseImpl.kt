package fr.lorentz.petclinic.pet.usecase.impl

import fr.lorentz.petclinic.annotation.UseCase
import fr.lorentz.petclinic.pet.gateway.CreatePetGateway
import fr.lorentz.petclinic.pet.gateway.ListPetsGateway
import fr.lorentz.petclinic.pet.request.PetUseCaseRequest
import fr.lorentz.petclinic.pet.request.toBusiness
import fr.lorentz.petclinic.pet.response.PetResponse
import fr.lorentz.petclinic.pet.response.toResponse
import fr.lorentz.petclinic.pet.usecase.CreatePetUseCase

@UseCase
class CreatePetUseCaseImpl(private val createPetGateway: CreatePetGateway): CreatePetUseCase {
    override fun create(petRequest: PetUseCaseRequest): PetResponse {
        return createPetGateway.create(petRequest.toBusiness()).toResponse()
    }
}