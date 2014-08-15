package co.edu.uniandes.csw.monitor.member.master.persistence.entity;

import co.edu.uniandes.csw.monitor.address.persistence.entity.AddressEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(MemberaddressesEntity.class)
public class MemberaddressesEntity_ { 

    public static volatile SingularAttribute<MemberaddressesEntity, Long> memberId;
    public static volatile SingularAttribute<MemberaddressesEntity, AddressEntity> memberIdEntity;
    public static volatile SingularAttribute<MemberaddressesEntity, Long> addressesId;
    public static volatile SingularAttribute<MemberaddressesEntity, AddressEntity> addressesIdEntity;

}