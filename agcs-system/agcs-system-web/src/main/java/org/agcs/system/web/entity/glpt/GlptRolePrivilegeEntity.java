package org.agcs.system.web.entity.glpt;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 角色权限
 * @date 2016-04-23
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="glpt_role_privilege")
@DynamicUpdate(true)
@DynamicInsert(true)
public class GlptRolePrivilegeEntity implements java.io.Serializable{
	
	// Fields
	/**ID*/
	private java.lang.String id;
	/**角色代号*/
	private java.lang.String roleCode;
	/**节点代号*/
	private java.lang.String nodeCode;
	/**描述*/
	private java.lang.String remark;
	/**录入人*/
	private java.lang.String lrr;
	/**录入人姓名*/
	private java.lang.String lrrxm;
	/**录入时间*/
	private java.util.Date lrsj;
	/**录入人部门*/
	private java.lang.String lrrbm;
	/**录入ip*/
	private java.lang.String lrip;
	/**录入mac*/
	private java.lang.String lrmac;
	
	// Constructors
	/** default constructor */
	public GlptRolePrivilegeEntity() {
	}
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name="ID", nullable=false,length=35)
	public java.lang.String getId(){
		return this.id;
	}
	public void setId(java.lang.String id){
		this.id = id;
	}
	
	@Column(name="ROLE_CODE", nullable=true,length=30)
	public java.lang.String getRoleCode(){
		return this.roleCode;
	}
	public void setRoleCode(java.lang.String roleCode){
		this.roleCode = roleCode;
	}
	
	@Column(name="NODE_CODE", nullable=true,length=30)
	public java.lang.String getNodeCode(){
		return this.nodeCode;
	}
	public void setNodeCode(java.lang.String nodeCode){
		this.nodeCode = nodeCode;
	}
	
	@Column(name="REMARK", nullable=true,length=300)
	public java.lang.String getRemark(){
		return this.remark;
	}
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	
	@Column(name="LRR", nullable=true,length=30)
	public java.lang.String getLrr(){
		return this.lrr;
	}
	public void setLrr(java.lang.String lrr){
		this.lrr = lrr;
	}
	
	@Column(name="LRRXM", nullable=true,length=50)
	public java.lang.String getLrrxm(){
		return this.lrrxm;
	}
	public void setLrrxm(java.lang.String lrrxm){
		this.lrrxm = lrrxm;
	}
	
	@Column(name="LRSJ", nullable=true)
	public java.util.Date getLrsj(){
		return this.lrsj;
	}
	public void setLrsj(java.util.Date lrsj){
		this.lrsj = lrsj;
	}
	
	@Column(name="LRRBM", nullable=true,length=30)
	public java.lang.String getLrrbm(){
		return this.lrrbm;
	}
	public void setLrrbm(java.lang.String lrrbm){
		this.lrrbm = lrrbm;
	}
	
	@Column(name="LRIP", nullable=true,length=30)
	public java.lang.String getLrip(){
		return this.lrip;
	}
	public void setLrip(java.lang.String lrip){
		this.lrip = lrip;
	}
	
	@Column(name="LRMAC", nullable=true,length=30)
	public java.lang.String getLrmac(){
		return this.lrmac;
	}
	public void setLrmac(java.lang.String lrmac){
		this.lrmac = lrmac;
	}
	
}