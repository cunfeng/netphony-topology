/*
 * tapi-topology API
 * tapi-topology API generated from tapi-topology.yang
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.tid.topologyModuleBase.TAPITopoModel.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.tid.topologyModuleBase.TAPITopoModel.model.Context;
import es.tid.topologyModuleBase.TAPITopoModel.model.NameAndValue;
import es.tid.topologyModuleBase.TAPITopoModel.model.NetworkTopologyService;
import es.tid.topologyModuleBase.TAPITopoModel.model.ServiceInterfacePoint;
import es.tid.topologyModuleBase.TAPITopoModel.model.Topology;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ContextSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-31T10:56:12.255Z")
public class ContextSchema   {
  @JsonProperty("label")
  private List<NameAndValue> label = new ArrayList<NameAndValue>();

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  @JsonProperty("service-interface-point")
  private List<ServiceInterfacePoint> serviceInterfacePoint = new ArrayList<ServiceInterfacePoint>();

  @JsonProperty("nw-topology-service")
  private NetworkTopologyService nwTopologyService = null;

  @JsonProperty("topology")
  private List<Topology> topology = new ArrayList<Topology>();

  public ContextSchema label(List<NameAndValue> label) {
    this.label = label;
    return this;
  }

  public ContextSchema addLabelItem(NameAndValue labelItem) {
    this.label.add(labelItem);
    return this;
  }

   /**
   * List of labels.A property of an entity with a value that is not expected to be unique and is allowed to change. A label carries no semantics with respect to the purpose of the entity and has no effect on the entity behavior or state.
   * @return label
  **/
  @JsonProperty("label")
  @ApiModelProperty(value = "List of labels.A property of an entity with a value that is not expected to be unique and is allowed to change. A label carries no semantics with respect to the purpose of the entity and has no effect on the entity behavior or state.")
  public List<NameAndValue> getLabel() {
    return label;
  }

  public void setLabel(List<NameAndValue> label) {
    this.label = label;
  }

  public ContextSchema uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity. UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters. Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}  Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity. UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters. Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}  Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ContextSchema name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public ContextSchema addNameItem(NameAndValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<NameAndValue> getName() {
    return name;
  }

  public void setName(List<NameAndValue> name) {
    this.name = name;
  }

  public ContextSchema serviceInterfacePoint(List<ServiceInterfacePoint> serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
    return this;
  }

  public ContextSchema addServiceInterfacePointItem(ServiceInterfacePoint serviceInterfacePointItem) {
    this.serviceInterfacePoint.add(serviceInterfacePointItem);
    return this;
  }

   /**
   * Get serviceInterfacePoint
   * @return serviceInterfacePoint
  **/
  @JsonProperty("service-interface-point")
  @ApiModelProperty(value = "")
  public List<ServiceInterfacePoint> getServiceInterfacePoint() {
    return serviceInterfacePoint;
  }

  public void setServiceInterfacePoint(List<ServiceInterfacePoint> serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
  }

  public ContextSchema nwTopologyService(NetworkTopologyService nwTopologyService) {
    this.nwTopologyService = nwTopologyService;
    return this;
  }

   /**
   * Get nwTopologyService
   * @return nwTopologyService
  **/
  @JsonProperty("nw-topology-service")
  @ApiModelProperty(value = "")
  public NetworkTopologyService getNwTopologyService() {
    return nwTopologyService;
  }

  public void setNwTopologyService(NetworkTopologyService nwTopologyService) {
    this.nwTopologyService = nwTopologyService;
  }

  public ContextSchema topology(List<Topology> topology) {
    this.topology = topology;
    return this;
  }

  public ContextSchema addTopologyItem(Topology topologyItem) {
    this.topology.add(topologyItem);
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @JsonProperty("topology")
  @ApiModelProperty(value = "")
  public List<Topology> getTopology() {
    return topology;
  }

  public void setTopology(List<Topology> topology) {
    this.topology = topology;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextSchema contextSchema = (ContextSchema) o;
    return Objects.equals(this.label, contextSchema.label) &&
        Objects.equals(this.uuid, contextSchema.uuid) &&
        Objects.equals(this.name, contextSchema.name) &&
        Objects.equals(this.serviceInterfacePoint, contextSchema.serviceInterfacePoint) &&
        Objects.equals(this.nwTopologyService, contextSchema.nwTopologyService) &&
        Objects.equals(this.topology, contextSchema.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, uuid, name, serviceInterfacePoint, nwTopologyService, topology);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextSchema {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
    sb.append("    nwTopologyService: ").append(toIndentedString(nwTopologyService)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

