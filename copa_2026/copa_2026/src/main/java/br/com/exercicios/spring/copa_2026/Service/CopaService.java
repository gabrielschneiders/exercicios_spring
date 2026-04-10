package br.com.exercicios.spring.copa_2026.Service;

import br.com.exercicios.spring.copa_2026.Entity.Copa;
import br.com.exercicios.spring.copa_2026.Repository.CopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CopaService {
    @Autowired

    private CopaRepository copaRepository;

    public Copa salvarCopa(Copa copa){
        Optional<Copa> copaSalvaporAno = copaRepository.findByAno(copa.getAno());
        if(copaSalvaporAno.isPresent()){
            throw new RuntimeException("já existe uma copa cadastrada para o ano ");
        }
        if(copa.getAno() % 4 != 2){
            throw new RuntimeException("O ano da copa não é válida");
        }

        return copaRepository.save(copa);
    }
    public List<Copa> listarTodasAsCopas(){
        return copaRepository.findAll();
    }
    public String deletarCopa(Long id){
        Optional<Copa> copa = copaRepository.findById(id);
        if(copa.isPresent()){
            copaRepository.deleteById(id);
            return "Copa deletado com sucesso!";
        }else{
            return "Copa não encontrada para o ID: "+ id;
        }
    }

    public Copa editarCopa(Long id, Copa copaAtualizada){
        Optional<Copa> copa = copaRepository.findById(id);
        if(copa.isPresent()){
            Copa copaExistente = copa.get();
            copaExistente.setLocal(copaAtualizada.getLocal() != null ?
                    copaAtualizada.getLocal() : copaExistente.getLocal());

            copaExistente.setDataInicio(copaAtualizada.getDataInicio() != null ?
                    copaAtualizada.getDataInicio() : copaExistente.getDataInicio());




            copaExistente.setDataFinal(copaAtualizada.getDataFinal() != null ?
                    copaAtualizada.getDataFinal() : copaExistente.getDataFinal());
            return copaRepository.save(copaExistente);

        }else{
            throw new RuntimeException("Copa não encontrada para o ID: "+ id);
        }


    }
    }


