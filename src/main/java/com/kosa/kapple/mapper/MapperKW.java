package com.kosa.kapple.mapper;

import com.kosa.kapple.domain.ContractVO;
import com.kosa.kapple.domain.ProposalVO;
import com.kosa.kapple.domain.SupplierVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface MapperKW {
    public Date test();
    public List<SupplierVO> getAll(String compo_name);
    public ProposalVO getProposal(String compo_name, String suppl_no);
    public ProposalVO getProposaltoContract(String proposal_no);
    public int saveContract(ContractVO contract);
    public int upProposalStat(String proposal_no);
    public int lastSEQ();

}
