package com.akaiyukiusagi.pagedlistsample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagedList
import com.akaiyukiusagi.pagedlistsample.Room.SampleDao
import com.akaiyukiusagi.pagedlistsample.Room.SampleDatabase
import com.akaiyukiusagi.pagedlistsample.Room.SampleEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SampleViewModel(context: Application): AndroidViewModel(context) {
    private var dao: SampleDao = SampleDatabase.getDatabase(context).sampleDao()
    val sampleList: LiveData<PagedList<SampleEntity>>

    fun insert() = viewModelScope.launch(Dispatchers.IO) {

        repository.insert(roomAnimal)
    }


//    private val repository: RoomRepository
//    val roomAnimals: LiveData<List<RoomAnimal>>
//    val concertList: LiveData<PagedList<RoomAnimal>>
//
//    init {
//        val roomAnimalDao = RoomLocalData.getDatabase(application,viewModelScope).roomAnimalDao()
//        repository = RoomRepository(roomAnimalDao)
//        roomAnimals = repository.animals
//        concertList = repository.concertList
//    }
//
//    fun insert(roomAnimal: RoomAnimal) = viewModelScope.launch(Dispatchers.IO) {
//        repository.insert(roomAnimal)
//    }
}