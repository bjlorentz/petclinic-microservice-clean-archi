package fr.lorentz.petclinic.pet.gateway

import fr.lorentz.petclinic.pet.entity.Pet
import fr.lorentz.petclinic.pet.entity.toBusiness
import fr.lorentz.petclinic.pet.entity.toEntity
import fr.lorentz.petclinic.pet.repository.PetRepository
import org.springframework.stereotype.Component

@Component
class PetsGatewayImpl(private val repository : PetRepository) :
        ListPetsGateway,
        CreatePetGateway{

    override fun create(pet: Pet): Pet {
        return repository.save(pet.toEntity()).toBusiness()
    }

    override fun listPets(): List<Pet> {
        return repository.findAll().map { it.toBusiness() }
    }
}