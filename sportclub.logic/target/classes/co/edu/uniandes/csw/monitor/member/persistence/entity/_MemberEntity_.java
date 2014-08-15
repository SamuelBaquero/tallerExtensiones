package co.edu.uniandes.csw.monitor.member.persistence.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(_MemberEntity.class)
public abstract class _MemberEntity_ { 

    public static volatile SingularAttribute<_MemberEntity, Long> id;
    public static volatile SingularAttribute<_MemberEntity, String> lastName;
    public static volatile SingularAttribute<_MemberEntity, String> name;
    public static volatile SingularAttribute<_MemberEntity, Boolean> enable;
    public static volatile SingularAttribute<_MemberEntity, Long> partnerId;
    public static volatile SingularAttribute<_MemberEntity, Date> birthDate;
    public static volatile SingularAttribute<_MemberEntity, String> firstName;
    public static volatile SingularAttribute<_MemberEntity, String> docNumber;
    public static volatile SingularAttribute<_MemberEntity, Long> documenttypeId;

}