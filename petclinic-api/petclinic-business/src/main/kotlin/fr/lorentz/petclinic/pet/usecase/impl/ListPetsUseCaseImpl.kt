package fr.lorentz.petclinic.pet.usecase.impl

import fr.lorentz.petclinic.annotation.UseCase
import fr.lorentz.petclinic.pet.gateway.ListPetsGateway
import fr.lorentz.petclinic.pet.entity.Pet
import fr.lorentz.petclinic.pet.response.PetResponse
import fr.lorentz.petclinic.pet.response.toResponse
import fr.lorentz.petclinic.pet.usecase.ListPetsUseCase

@UseCase
class ListPetsUseCaseImpl(private val listPetsGateway: ListPetsGateway) : ListPetsUseCase {
//class ListPetsUseCaseImpl() : ListPetsUseCase {
    override fun listPets(): List<PetResponse> {
        return listPetsGateway.listPets().map { it.toResponse() }
//        return listOf(Pet(1, "Bob")).map { it.toResponse() }
    }
}
//class ListPetsUseCaseImpl(private val listPetsGateway: ListPetsGateway) : ListPetsUseCase {
//    override fun listPets(): List<PetResponse> {
//        return listPetsGateway.listPets().map { it.toResponse() }
//    }
//}