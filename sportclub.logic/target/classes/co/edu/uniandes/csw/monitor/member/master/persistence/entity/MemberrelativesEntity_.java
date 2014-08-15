package co.edu.uniandes.csw.monitor.member.master.persistence.entity;

import co.edu.uniandes.csw.monitor.member.persistence.entity.MemberEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(MemberrelativesEntity.class)
public class MemberrelativesEntity_ { 

    public static volatile SingularAttribute<MemberrelativesEntity, Long> relativesId;
    public static volatile SingularAttribute<MemberrelativesEntity, Long> memberId;
    public static volatile SingularAttribute<MemberrelativesEntity, MemberEntity> memberIdEntity;
    public static volatile SingularAttribute<MemberrelativesEntity, MemberEntity> relativesIdEntity;

}