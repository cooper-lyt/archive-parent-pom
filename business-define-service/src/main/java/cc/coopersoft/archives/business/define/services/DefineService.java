package cc.coopersoft.archives.business.define.services;

import cc.coopersoft.archives.business.define.model.BusinessDefineSummary;
import cc.coopersoft.archives.business.define.repository.BusinessDefineRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DefineService {

    @Autowired
    private BusinessDefineRep businessDefineRep;

    private Set<String> getMineRoles(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            return AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        }
        return null;
    }


    public List<BusinessDefineSummary> getMineDefine(){
        return businessDefineRep.listDefineSummaryByRole(getMineRoles());
    }
}
