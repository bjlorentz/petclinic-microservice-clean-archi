package fr.lorentz.petclinic.pet.repository

import fr.lorentz.petclinic.pet.entity.PetEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository : CrudRepository<PetEntity, Int> {}