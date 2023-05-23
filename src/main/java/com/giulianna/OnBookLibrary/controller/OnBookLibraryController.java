package com.giulianna.OnBookLibrary.controller;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;
import com.giulianna.OnBookLibrary.service.OnBookLibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class OnBookLibraryController {

    private final OnBookLibraryService onBookLibraryService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<OnBookLibraryResponseDTO> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(onBookLibraryService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<OnBookLibraryResponseDTO>> findAll() {
        return ResponseEntity.ok().body(onBookLibraryService.findAll());
    }

    @PostMapping(value = "/create_user")
    public ResponseEntity<OnBookLibraryResponseDTO> register (@RequestBody OnBookLibraryRequestDTO onBookLibraryRequestDTO, UriComponentsBuilder uriBuilder) {

        OnBookLibraryResponseDTO onBookLibraryResponseDTO = onBookLibraryService.register(onBookLibraryRequestDTO);

        URI uri = uriBuilder.path("/book/{id}").buildAndExpand(onBookLibraryResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(onBookLibraryResponseDTO);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<OnBookLibraryResponseDTO> update(@RequestBody OnBookLibraryRequestDTO onBookLibraryDTO, @PathVariable(name = "id" ) Long id) {
        return  ResponseEntity.ok().body(onBookLibraryService.update(id, onBookLibraryDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(onBookLibraryService.delete(id));
    }
}
